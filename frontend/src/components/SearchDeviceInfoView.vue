<template>

    <v-data-table
        :headers="headers"
        :items="searchDeviceInfo"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchDeviceInfoView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "userId", value: "userId" },
                { text: "deviceType", value: "deviceType" },
                { text: "deviceModel", value: "deviceModel" },
                { text: "deviceStatus", value: "deviceStatus" },
            ],
            searchDeviceInfo : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchDeviceInfos'))

            temp.data._embedded.searchDeviceInfos.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchDeviceInfo = temp.data._embedded.searchDeviceInfos;
        },
        methods: {
        }
    }
</script>

