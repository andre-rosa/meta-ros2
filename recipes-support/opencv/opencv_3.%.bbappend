# Copyright (c) 2019 LG Electronics, Inc.

#ALLOW_EMPTY_${PN}-staticdev = "1"

# Fix up PACKAGECONFIG if Python 2 is being used.
PACKAGECONFIG_prepend = "${@'python2 ' if d.getVar('ROS_PYTHON_VERSION', True) == '2' else ''}"
# _remove happens after _prepend.
PACKAGECONFIG_remove = "${@'python3' if d.getVar('ROS_PYTHON_VERSION', True) == '2' else ''}"
