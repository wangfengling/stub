package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
            url '/api/testDel/deleteUser'
        body([
                "client.id": $(regex('[0-9]{10}')),
                loanAmount: 99999
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body([
                code: "200",
                "message": "成功"
        ])
        headers {
            contentType('application/json')
        }
    }
}
