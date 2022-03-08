import Vue from "vue";
import App from "./App";
import router from "./router";
import store from "./store";

vue.config.productionTip = false;

new vue({
    router,
    store,
    render: h => h(App)
}).$mount("#app");