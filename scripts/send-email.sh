ls
echo "Inicio da instalação"
sudo apt-get install mailutils
echo "Fim da instalação"
echo "$EMAIL_TEST"
echo "Pipeline executada com sucesso!" | mail -s "subject:Pipeline Exercicio_S207" "$EMAIL_GABRIEL"
echo "Pipeline executada com sucesso!" | mail -s "subject:Pipeline Exercicio_S207" "$EMAIL_DAVI"