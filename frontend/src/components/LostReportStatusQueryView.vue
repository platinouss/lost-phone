<template>

    <v-data-table
        :headers="headers"
        :items="lostReportStatusQuery"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'LostReportStatusQueryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            lostReportStatusQuery : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/lostReportStatusQueries'))

            temp.data._embedded.lostReportStatusQueries.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.lostReportStatusQuery = temp.data._embedded.lostReportStatusQueries;
        },
        methods: {
        }
    }
</script>

