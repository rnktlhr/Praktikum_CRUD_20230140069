# User API Specification

## Create User
Endpoint : POST /api/users

Request Body :

```json
{
  "nama" : "rinakitluhur",
  "usia" : 20
}
```

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "rinakitluhur",
    "usia": 20
  }
}
```

Response Body (failed) :

```json
{
  "error": "Invalid input data"
}
```

## Update User
Endpoint : PUT /api/users/{id}

Request Body :

```json
{
  "nama" : "rinakitluhur",
  "usia" : 20
}
```

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "rinakitluhur",
    "usia": 20
  }
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

## Get User
Endpoint : GET /api/users

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "rinakitluhu",
    "usia": 20
  }
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

## Delete User
Endpoint : DELETE /api/users/{id}

Response Body (success) :

```json
{
  "message": "User deleted successfully"
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```


Hasil tampilan
<img width="1919" height="1151" alt="image" src="https://github.com/user-attachments/assets/097828b7-0b33-49e5-a3ba-87398f564be7" />
