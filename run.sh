echo "### Maven packaging ###"
echo ""
mvn clean package
mvn clean install

echo "### Kill Containers ###"
echo ""
docker-compose stop
docker-compose down

echo "### Remove docker image ###"
echo ""
docker image rm springmvchibernate_app

cat << "EOF" 
  ____   __     __  ____  
 |  _ \  \ \   / / |  _ \ 
 | |_) |  \ \ / /  | |_) |
 |  __/    \ V /   |  _ < 
 |_|        \_/    |_| \_\
                          
EOF

echo "### Create new container ###"
echo ""
docker-compose up
