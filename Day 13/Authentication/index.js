const bcrypt = require('bcrypt');
const username="veera";
const password ="pass@123";

const hashPassword = async(password)=>{
    const result = await bcrypt.hash(password,10);
    console.log(result);
    return result;
} 

hashPassword(password);