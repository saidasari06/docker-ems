FROM node:18-alpine3.20
WORKDIR /app
COPY package.json /app
#COPY package-lock.json /app
RUN npm cache clean --force && npm install


COPY . .
RUN npm run build
EXPOSE 2802
CMD ["npm","start"]

