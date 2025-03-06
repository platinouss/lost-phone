<template>

    <v-data-table
        :headers="headers"
        :items="searchPhoneInfo"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchPhoneInfoView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchPhoneInfo : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchPhoneInfos'))

            temp.data._embedded.searchPhoneInfos.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchPhoneInfo = temp.data._embedded.searchPhoneInfos;
        },
        methods: {
        }
    }
</script>

