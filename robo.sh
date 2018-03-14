#/bin/bash

echo "Iniciando Processo..."

psql -U postgres -h 192.168.1.110 -c "select pg_terminate_backend(pid) from pg_stat_activity where datname = 'robo'"
echo "Finalizando Processo Existente..."
psql -U postgres -h 192.168.1.110 -c "DROP DATABASE IF EXISTS robo"
echo "Excluindo Banco...."
psql -U postgres -h 192.168.1.110 -c "CREATE DATABASE robo"
echo "Criando novo Banco..."
psql -U conam -h 192.168.1.110 -d "robo" -f /home/severino/robo.dump
echo "Subindo dump padrão..."
 	
