# Use the official Elasticsearch image from Docker Hub
FROM docker.elastic.co/elasticsearch/elasticsearch:8.15.0
#COPY elasticsearch.yml /usr/share/elasticsearch/config/elasticsearch.yml
# Optional: Set custom configurations or environment variables
# Example: Set a custom Elasticsearch heap size (for example, setting the heap size to 2GB)
ENV ES_JAVA_OPTS="-Xms1g -Xmx1g"

# Optional: Add custom plugins, scripts, or configurations
# Example: You can copy your custom elasticsearch.yml file here (if you have one)
# COPY elasticsearch.yml /usr/share/elasticsearch/config/

# Expose necessary ports
EXPOSE 9200 9300

# Set the entry point (optional, this is already defined in the base image)
# ENTRYPOINT ["/usr/local/bin/docker-entrypoint.sh"]

# Command to run Elasticsearch (this is already defined in the base image)
# CMD ["elasticsearch"]

