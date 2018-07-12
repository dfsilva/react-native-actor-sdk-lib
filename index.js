
import { NativeModules } from 'react-native';

const { RNActorSdkLib } = NativeModules;

export default {
    startMessenger: () => {
        RNActorSdkLib.startMessenger()
    },
    sendMessage: (message, callback) =>{
        RNActorSdkLib.sendMessage(message, callback)
    }
};
