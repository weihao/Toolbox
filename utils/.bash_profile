# .bash_profile is executed to configure your shell before the initial command prompt.

# Get the aliases and functions
if [ -f ~/.bashrc ]; then
        . ~/.bashrc
fi

PATH=$PATH:$HOME/.local/bin:$HOME/bin
export PATH

# Get the aliases and functions from local config file:
if [ -f ~/.bashrc ]; then
   source ~/.bashrc
fi

PS1='\# \u@\H in \w >'
#
# Set default file permissions:
umask 077

# Alias
alias h=history
alias hg='history | grep'

# Java Path.
export JAVA_HOME=~/Downloads/jdk1.8.0_181/bin/
PATH=~/bin:$PATH:./:~/Downloads/jdk1.8.0_181/bin/

# end .bash_profile
