http://localhost:8080/payments - внести данные платежа

ЗАДАНИЕ 
Реализовать сервис расчета комиссии по платежам. 
 
В системе хранятся данные о платежах: 
- пользователь (уникальный идентификатор или номер телефона) 
- сумма платежа 
- дата платежа 
- комментарий 
 
Реализовать REST endpoint для подсчета комиссии по платежу. 
Входными данными являются данные для платежа, выходными - сумма комиссии. 
 
Правила расчета комиссии задаются сеткой, где пороговые значения - это сумма всех платежей пользователя за текущий месяц: 
от 0 до 10 000 - 1% от суммы платежа 
от 10 000 до 100 000 - 3 % от суммы платежа 
от 100 000 - 5% от суммы платежа 
 
Например: 
если сумма всех платежей пользователя за текущий месяц составила 30 000 рублей, то его комиссия - 3% 
 
Требования по реализации: 
1. Использовать Spring framework 
2. Покрыть код Unit-тестами 
3. Не обязательно использовать БД, можно сохранить данные в памяти. 
4. Интеграционные тесты будут плюсом.
