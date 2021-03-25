# spring-boot-graphql
spring boot graphql example

query {
vehicles(count: 3)
{
id,
type,
modelCode
}
}