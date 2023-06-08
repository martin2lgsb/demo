import { createApp } from 'vue'
import App from './App.vue'
import Axios from 'axios'


var app = createApp(App)
app.config.globalProperties.Axios = Axios
app.mount("#app")
// createApp(App).use(axios).mount('#app')

