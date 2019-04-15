# OE DISTRO configuration settings common to both ROS 1 and ROS 2 distros.

ROS_DISTRO_VERSION_MAJOR = "${ROS_DISTRO}"
# Use the date portion of ROS_SUPERFLORE_GENERATION_DATETIME for the minor version. We assume that the upstream
# ROS_DISTRO-cache.yaml.gz won't be updated more than once a day.
ROS_DISTRO_VERSION_MINOR = "${@d.getVar('ROS_SUPERFLORE_GENERATION_DATETIME')[0:8]}"
# Value determined by superflore and set in conf/ros-distro/include/ROS_DISTRO/generated-ros-distro.inc
ROS_NUM_CACHE_YAML_COMMITS ??= "0"
ROS_DISTRO_VERSION_MICRO = "${ROS_NUM_CACHE_YAML_COMMITS}"
# XXX ROS_META_REVISION set in layer.conf, increment every time new meta-ros is released <- is this the right place?
ROS_META_REVISION ??= "0"
ROS_DISTRO_VERSION_REVISION = "${ROS_META_REVISION}"

DISTRO_CODENAME = "${ROS_DISTRO}"
DISTRO_VERSION = "${ROS_DISTRO_VERSION_MAJOR}.${ROS_DISTRO_VERSION_MINOR}.${ROS_DISTRO_VERSION_MICRO}.${ROS_DISTRO_VERSION_REVISION}"

MAINTAINER = "Open Source Robotics Foundation, Inc. <info@openrobotics.org>"
