cat /var/log/auth.log | grep 'sshd.*Invalid user'
cat /var/log/auth.log | grep 'sshd.*Failed password'

cat /var/log/auth.log | grep 'sshd.*session opened'
