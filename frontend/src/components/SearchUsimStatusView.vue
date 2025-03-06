<template>

    <v-data-table
        :headers="headers"
        :items="searchUsimStatus"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchUsimStatusView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchUsimStatus : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchUsimStatuses'))

            temp.data._embedded.searchUsimStatuses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchUsimStatus = temp.data._embedded.searchUsimStatuses;
        },
        methods: {
        }
    }
</script>

