
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PhoneLostReportHistoryManager from "./components/listers/PhoneLostReportHistoryCards"
import PhoneLostReportHistoryDetail from "./components/listers/PhoneLostReportHistoryDetail"
import PhoneDeviceManager from "./components/listers/PhoneDeviceCards"
import PhoneDeviceDetail from "./components/listers/PhoneDeviceDetail"

import LostReportStatusQueryView from "./components/LostReportStatusQueryView"
import LostReportStatusQueryViewDetail from "./components/LostReportStatusQueryViewDetail"
import SearchPhoneInfoView from "./components/SearchPhoneInfoView"
import SearchPhoneInfoViewDetail from "./components/SearchPhoneInfoViewDetail"
import CustomerCustomerManager from "./components/listers/CustomerCustomerCards"
import CustomerCustomerDetail from "./components/listers/CustomerCustomerDetail"

import SearchCustomerView from "./components/SearchCustomerView"
import SearchCustomerViewDetail from "./components/SearchCustomerViewDetail"
import UsimUsimManager from "./components/listers/UsimUsimCards"
import UsimUsimDetail from "./components/listers/UsimUsimDetail"

import SearchUsimStatusView from "./components/SearchUsimStatusView"
import SearchUsimStatusViewDetail from "./components/SearchUsimStatusViewDetail"
import MessageUsimBlockHistoryManager from "./components/listers/MessageUsimBlockHistoryCards"
import MessageUsimBlockHistoryDetail from "./components/listers/MessageUsimBlockHistoryDetail"
import MessageVerificationInfoManager from "./components/listers/MessageVerificationInfoCards"
import MessageVerificationInfoDetail from "./components/listers/MessageVerificationInfoDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/phones/lostReportHistories',
                name: 'PhoneLostReportHistoryManager',
                component: PhoneLostReportHistoryManager
            },
            {
                path: '/phones/lostReportHistories/:id',
                name: 'PhoneLostReportHistoryDetail',
                component: PhoneLostReportHistoryDetail
            },
            {
                path: '/phones/devices',
                name: 'PhoneDeviceManager',
                component: PhoneDeviceManager
            },
            {
                path: '/phones/devices/:id',
                name: 'PhoneDeviceDetail',
                component: PhoneDeviceDetail
            },

            {
                path: '/phones/lostReportStatusQueries',
                name: 'LostReportStatusQueryView',
                component: LostReportStatusQueryView
            },
            {
                path: '/phones/lostReportStatusQueries/:id',
                name: 'LostReportStatusQueryViewDetail',
                component: LostReportStatusQueryViewDetail
            },
            {
                path: '/phones/searchPhoneInfos',
                name: 'SearchPhoneInfoView',
                component: SearchPhoneInfoView
            },
            {
                path: '/phones/searchPhoneInfos/:id',
                name: 'SearchPhoneInfoViewDetail',
                component: SearchPhoneInfoViewDetail
            },
            {
                path: '/customers/customers',
                name: 'CustomerCustomerManager',
                component: CustomerCustomerManager
            },
            {
                path: '/customers/customers/:id',
                name: 'CustomerCustomerDetail',
                component: CustomerCustomerDetail
            },

            {
                path: '/customers/searchCustomers',
                name: 'SearchCustomerView',
                component: SearchCustomerView
            },
            {
                path: '/customers/searchCustomers/:id',
                name: 'SearchCustomerViewDetail',
                component: SearchCustomerViewDetail
            },
            {
                path: '/usims/usims',
                name: 'UsimUsimManager',
                component: UsimUsimManager
            },
            {
                path: '/usims/usims/:id',
                name: 'UsimUsimDetail',
                component: UsimUsimDetail
            },

            {
                path: '/usims/searchUsimStatuses',
                name: 'SearchUsimStatusView',
                component: SearchUsimStatusView
            },
            {
                path: '/usims/searchUsimStatuses/:id',
                name: 'SearchUsimStatusViewDetail',
                component: SearchUsimStatusViewDetail
            },
            {
                path: '/messages/usimBlockHistories',
                name: 'MessageUsimBlockHistoryManager',
                component: MessageUsimBlockHistoryManager
            },
            {
                path: '/messages/usimBlockHistories/:id',
                name: 'MessageUsimBlockHistoryDetail',
                component: MessageUsimBlockHistoryDetail
            },
            {
                path: '/messages/verificationInfos',
                name: 'MessageVerificationInfoManager',
                component: MessageVerificationInfoManager
            },
            {
                path: '/messages/verificationInfos/:id',
                name: 'MessageVerificationInfoDetail',
                component: MessageVerificationInfoDetail
            },



    ]
})
