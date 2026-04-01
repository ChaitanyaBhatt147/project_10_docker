# Stage 1: Build Angular
FROM node:18 as build

WORKDIR /app

COPY . .

RUN npm install
RUN npm run build --prod

# Stage 2: Run with Nginx
FROM nginx:alpine

COPY --from=build /app/dist/orsproject-10-ui /usr/share/nginx/html

EXPOSE 80