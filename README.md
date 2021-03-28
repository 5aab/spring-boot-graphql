# spring-boot-graphql
spring boot graphql example
https://medium.com/@shitalkumarchivate/securing-graphql-api-with-spring-security-8c232de2804d

http://localhost:8080/graphiql

query {
vehicles(count: 3)
{
id,
type,
modelCode
}
}

query {
compositeWithArgs(brandNames: ["Ferrari","Chevrolet"]) {
brandName
type
id
}
}

query {
vehicles (count: 2){
brandName
}
composites(brandName: "Ferrari") {
brandName
}
}

query CompositesWithVariables($args: [String]) {
compositeWithArgs(brandNames: $args) {
brandName
type
id
}
}
{
"args": ["Chevrolet"]
}

query CompositesWithVariables($args: [QueryArgument]) {
compositeWithQueryArguments(queryArguments: $args) {
brandName
type
id
}
}
{
"columnName": "brandName",
"operator": "equal",
"value": "Ferrari"
}
