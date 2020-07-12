
var change = {
    deviceStatus:function (status) {
        if(status == 1){
            return "online";
        }else{
            return "offline";
        }
    },

    deviceType:function (devType) {
        if(devType==1){
            return"Smart Light";
        }else if(devType==2){
            return "Smart air-conditioner"
        }

    }
}