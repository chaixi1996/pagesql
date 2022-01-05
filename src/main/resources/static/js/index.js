var indexVue = new Vue({
    el: "#mainBody",
    data: {
        query: {},//用于保存页面需要提交的条件
        returnData: {},//返回的data
    },
    methods: {
        //点击提交按钮
        submit: function () {
            $.ajax({
                url: "page/sql",
                type: "post",
                data: JSON.stringify(this.query),
                contentType: "application/json",
            }).then(res=>{
                console.log(res.data);
                this.returnData = res.data;
                $("#backDiv").show();
            })
        }
    }
})