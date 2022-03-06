const path = require('path')
/**해당 코드는 "상위경로/src/" 의 경로를 @로 대체하는 코드.**/
module.exports ={
    resolve:{
        alias:{
            '@':path.resolve(__dirname,'src/')
        }
    }
};