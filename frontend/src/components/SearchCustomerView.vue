<template>

    <v-data-table
        :headers="headers"
        :items="searchCustomer"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchCustomerView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchCustomer : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchCustomers'))

            temp.data._embedded.searchCustomers.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchCustomer = temp.data._embedded.searchCustomers;
        },
        methods: {
        }
    }
</script>

