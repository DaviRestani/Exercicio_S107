echo "Inicio da instalação"
sudo apt-get install mailutils
echo "Fim da instalação"
echo "Build executada com sucesso!" | mail -s "subject: qualquer coisa" "$EMAIL_DAVI"
echo "Build executada com sucesso!" | mail -s "subject: qualquer coisa" $EMAIL_GABRIEL