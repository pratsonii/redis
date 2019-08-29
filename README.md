# redis
Redis cache implementation using spring boot

# 1)
Download Redis from : https://github.com/MicrosoftArchive/redis/releases
Installation Help : https://www.youtube.com/watch?v=nQEpoRiElyY

# 2)
Download the code and start server

# 3)

Create entry into cache
GET http://localhost:8080/redis/add/1/pratik
(1=Key and pratik=value)

Update entry
GET http://localhost:8080/redis/update/1/rajat
(value is updated to "rajat")

Clear cache
GET http://localhost:8080/redis/delete/1
