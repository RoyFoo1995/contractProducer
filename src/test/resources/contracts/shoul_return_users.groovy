package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.spec.internal.HttpMethods

Contract.make {

    Map<String, String> userMap = new HashMap<>()
    userMap.put("name", "张三")
    userMap.put("role", "test1")
    userMap.put("name", "李四")
    userMap.put("role", "test2")


    request {
        url("/users")
        method(HttpMethods.HttpMethod.GET)
    }

    response {
        status(200)
        body(userMap)
    }
}