/*var indexVue = new Vue({
    el: "#mainBody",
    data: {
        sql:{},
        queryr:[]
    },
    methods: {
        //点击提交按钮
        submit: function () {
            $.ajax({
                url: "page/sql",
                type: "post",
                data: this.sql,
                contentType: "application/json",
            }).then(res=>{
                console.log(res.data);
                this.queryr = res.data;
                $("#backDiv").show();
            })
        }
    }
})*/


var indexVue = new Vue({
    el:"#mainBody",
    data:{
        sql:{},
        linkmanList:[]
    },
    methods:{
        submit: function () {
            //发送异步请求
            axios.get("page/sql?sql=",sql).then(response=>{
                //response.data就是响应体的内容(json)
                if (response.data.flag) {
                    //获取成功
                    console.log(response.data.message);
                    console.log(response.data.maps);
                    console.log(response.data.find);
                    console.log(response.data.data);
                    this.linkmanList = response.data.data
                }
            })
        }
    },
});