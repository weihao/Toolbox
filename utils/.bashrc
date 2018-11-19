# .bashrc is executed for interactive non-login shells.

# Source global definitions
if [ -f /etc/bashrc ]; then
        . /etc/bashrc
fi

[ -z "$PS1" ] && return

shopt -s checkwinsize

[ -x /usr/bin/lesspipe ] && eval "$(SHELL=/bin/sh lesspipe)"
