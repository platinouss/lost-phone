<template>

    <v-data-table
        :headers="headers"
        :items="searchReport"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchReportView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "userId", value: "userId" },
                { text: "deviceId", value: "deviceId" },
                { text: "status", value: "status" },
                { text: "reportedAt", value: "reportedAt" },
                { text: "clearedAt", value: "clearedAt" },
                { text: "contents", value: "contents" },
            ],
            searchReport : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchReports'))

            temp.data._embedded.searchReports.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchReport = temp.data._embedded.searchReports;
        },
        methods: {
        }
    }
</script>

