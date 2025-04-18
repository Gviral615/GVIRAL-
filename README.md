
# Gviral Backend

Spring Boot backend for Gviral — includes Firebase Auth support, music upload metadata, admin tools, and livestream scheduling.

## Features
- Firebase Auth (token verification placeholder)
- Music upload metadata endpoint
- Admin: Ban/report users
- Livestream scheduling + list

## Deployment (Render.com)

1. Push this repo to your GitHub account
2. Go to [https://render.com](https://render.com) and click "New Web Service"
3. Connect your GitHub repo and fill in:

**Build command:**
```
./mvnw clean install
```

**Start command:**
```
java -jar target/gviral-backend-0.0.1-SNAPSHOT.jar
```

**Environment:**
- Runtime: Java 17+
- Port: 8080

Render will auto-deploy and give you a public API URL like:
`https://gviral-backend.onrender.com`

## API Endpoints

- `POST /api/music/upload`
- `GET /api/livestreams`
- `POST /api/livestreams/schedule`
- `POST /api/admin/ban`
- `GET /api/admin/reports`
- `POST /api/auth/verify`

---
