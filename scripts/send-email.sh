ls
echo "Inicio da instalação"
sudo apt-get install mailutils
echo "Fim da instalação"
mail -s "subject:Exercicio_S207" "$EMAIL_GABRIEL" <<< 'Pipeline executada com sucesso!'
mail -s "subject:Exercicio_S207" "$EMAIL_DAVI" <<< 'Pipeline executada com sucesso!'