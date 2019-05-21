# OE DISTRO configuration settings common to both ROS 1 and ROS 2 distros.
#
# Copyright (c) 2019 LG Electronics, Inc.

ROS_DISTRO_VERSION_MAJOR = "${ROS_DISTRO}"

# Crystal releases have been given patch numbers, but none of the others have them => use the release date (YYYYMMDD) for the
# minor version, unless this is prior to the first release of a ROS_DISTRO, when the date portion of
# ROS_SUPERFLORE_GENERATION_DATETIME is used.
ROS_DISTRO_VERSION_MINOR = "${@d.getVar('ROS_SUPERFLORE_GENERATION_DATETIME')[0:8] \
                               if d.getVar('ROS_DISTRO_RELEASE_DATE') == '' else \
                               d.getVar('ROS_DISTRO_RELEASE_DATE')}"

# Value determined by superflore and set in conf/ros-distro/include/ROS_DISTRO/generated-ros-distro.inc
ROS_NUM_CACHE_YAML_COMMITS ??= "0"
ROS_DISTRO_VERSION_MICRO = "${ROS_NUM_CACHE_YAML_COMMITS}"

# XXX ROS_META_REVISION set in layer.conf, increment every time new meta-ros is released <- is this the right place?
ROS_META_REVISION ??= "0"
ROS_DISTRO_VERSION_REVISION = "${ROS_META_REVISION}"

DISTRO_CODENAME = "${ROS_DISTRO}"
DISTRO_VERSION = "${ROS_DISTRO_VERSION_MAJOR}.${ROS_DISTRO_VERSION_MINOR}.${ROS_DISTRO_VERSION_MICRO}.${ROS_DISTRO_VERSION_REVISION}"

MAINTAINER = "Open Source Robotics Foundation, Inc. <info@openrobotics.org>"

# Use systemd, but keep SysVinit present (see https://www.yoctoproject.org/docs/2.6.2/mega-manual/mega-manual.html#selecting-an-initialization-manager).
DISTRO_FEATURES_append = " systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"
