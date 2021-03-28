# spring-boot-graphql
spring boot graphql example

http://localhost:8080/graphiql

query {
vehicles(count: 3)
{
id,
type,
modelCode
}
}