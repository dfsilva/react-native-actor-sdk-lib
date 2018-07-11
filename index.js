
import { NativeModules } from 'react-native';

const { RNActorSdkLib } = NativeModules;

export default {
    startMessenger: function () {
        //RNActorSdkLib.startMessenger()
    },
    sendMessage: function(message, callback){
        //RNActorSdkLib.sendMessage(message, callback)
    }
};
