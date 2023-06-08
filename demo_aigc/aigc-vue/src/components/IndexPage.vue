<template>
  <div class="txt2img">
    <h1>{{ msg }} - TXT2IMG</h1>
    <p>{{ prompt }}</p>
    <input type="text" placeholder="输入描述" v-model="prompt">
    <button @click="this.txt2img">生成图片</button> {{ prompt_check }}
    <br>
    <p></p>
    <span style="margin-right: 10px" @click="this.addAdj($event)">8k</span>
    <span style="margin-right: 10px" @click="this.addAdj($event)">未编辑</span>
    <span style="margin-right: 10px" @click="this.addAdj($event)">高清</span>
    <span style="margin-right: 10px" @click="this.addAdj($event)">对称视图</span>
    <span style="margin-right: 10px" @click="this.addAdj($event)">框内</span>
    <span style="margin-right: 10px" @click="this.addAdj($event)">Canon EOS R3</span>
    <span style="margin-right: 10px" @click="this.addAdj($event)">戏剧灯光</span>
  </div>
  <br>
  <div class="imgshow">
    <img :src="img_src" alt="">
  </div>
</template>

<script>

export default {
  name: "IndexPage",
  props: {
    msg: String
  },
  data() {
    return {
      prompt: "",
      prompt_check: "",
      img_src: ""
    }
  },
  methods: {
    txt2img() {
      this.prompt = this.prompt.trim()
      // const prompt = this.$refs.prompt.value.trim();
      if (this.prompt === "") {
        this.img_src = ""
        this.prompt_check = "请输入描述！"
      } else {
        this.prompt_check = ""
        const api = "http://127.0.0.1:8801/txt2img?prompt=" + this.prompt;
        this.Axios.get(api).then((res) => {
          this.img_src = res.data[0]
        }).catch(error => {
          console.log(error)
        })
        console.log(this.prompt)
      }
    },
    addAdj(e) {
      if (this.prompt === "") {
        this.prompt_check = "请输入描述！"
      } else {
        this.prompt = this.prompt + ", " + e.target.innerText
        e.target.remove()
      }
    }
  }
}
</script>

<style scoped>

</style>