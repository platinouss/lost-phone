
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PhoneDeviceManager from "./components/listers/PhoneDeviceCards"
import PhoneDeviceDetail from "./components/listers/PhoneDeviceDetail"

import SearchDeviceInfoView from "./components/SearchDeviceInfoView"
import SearchDeviceInfoViewDetail from "./components/SearchDeviceInfoViewDetail"
import CustomerCustomerManager from "./components/listers/CustomerCustomerCards"
import CustomerCustomerDetail from "./components/listers/CustomerCustomerDetail"

import SearchCustomerView from "./components/SearchCustomerView"
import SearchCustomerViewDetail from "./components/SearchCustomerViewDetail"
import UsimUsimManager from "./components/listers/UsimUsimCards"
import UsimUsimDetail from "./components/listers/UsimUsimDetail"

import MessageUsimBlockHistoryManager from "./components/listers/MessageUsimBlockHistoryCards"
import MessageUsimBlockHistoryDetail from "./components/listers/MessageUsimBlockHistoryDetail"

import ReportReportHistoryManager from "./components/listers/ReportReportHistoryCards"
import ReportReportHistoryDetail from "./components/listers/ReportReportHistoryDetail"

import SearchReportView from "./components/SearchReportView"
import SearchReportViewDetail from "./components/SearchReportViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
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
                path: '/phones/searchDeviceInfos',
                name: 'SearchDeviceInfoView',
                component: SearchDeviceInfoView
            },
            {
                path: '/phones/searchDeviceInfos/:id',
                name: 'SearchDeviceInfoViewDetail',
                component: SearchDeviceInfoViewDetail
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
                path: '/reports/reportHistories',
                name: 'ReportReportHistoryManager',
                component: ReportReportHistoryManager
            },
            {
                path: '/reports/reportHistories/:id',
                name: 'ReportReportHistoryDetail',
                component: ReportReportHistoryDetail
            },

            {
                path: '/reports/searchReports',
                name: 'SearchReportView',
                component: SearchReportView
            },
            {
                path: '/reports/searchReports/:id',
                name: 'SearchReportViewDetail',
                component: SearchReportViewDetail
            },


    ]
})
