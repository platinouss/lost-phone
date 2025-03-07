
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PhoneDeviceManager from "./components/listers/PhoneDeviceCards"
import PhoneDeviceDetail from "./components/listers/PhoneDeviceDetail"

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

import ReportReportHistoryManager from "./components/listers/ReportReportHistoryCards"
import ReportReportHistoryDetail from "./components/listers/ReportReportHistoryDetail"

import LostReportStatusQueryView from "./components/LostReportStatusQueryView"
import LostReportStatusQueryViewDetail from "./components/LostReportStatusQueryViewDetail"

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
                path: '/reports/lostReportStatusQueries',
                name: 'LostReportStatusQueryView',
                component: LostReportStatusQueryView
            },
            {
                path: '/reports/lostReportStatusQueries/:id',
                name: 'LostReportStatusQueryViewDetail',
                component: LostReportStatusQueryViewDetail
            },


    ]
})
