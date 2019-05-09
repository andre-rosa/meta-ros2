# Metadata common to all ROS component types.

export ROS_DISTRO
export ROS_VERSION
export ROS_PYTHON_VERSION

# Ensure that PYTHON_PN is always set. (ROS_PYTHON_VERSION is set in generated-ros-distro.inc, ie, it will never be unset when
# we get here.)
inherit ${@'python3-dir' if d.getVar('ROS_PYTHON_VERSION') == '3' else 'python-dir'}
