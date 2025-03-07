<template>

    <v-card outlined>
        <v-card-title>
            SearchDeviceInfo # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="UserId" v-model="item.userId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="DeviceType" v-model="item.deviceType" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="DeviceModel" v-model="item.deviceModel" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="DeviceStatus" v-model="item.deviceStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'SearchDeviceInfoViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/searchDeviceInfos/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

