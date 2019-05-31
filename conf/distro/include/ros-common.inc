# OE DISTRO configuration settings common to both ROS 1 and ROS 2 distros.
#
# Copyright (c) 2019 LG Electronics, Inc.

DISTRO_CODENAME = "${ROS_DISTRO}"
DISTRO_VERSION = "${ROS_DISTRO_METADATA_VERSION}"

MAINTAINER = "Open Source Robotics Foundation, Inc. <info@openrobotics.org>"

# Use systemd, but keep SysVinit present (see https://www.yoctoproject.org/docs/2.6.2/mega-manual/mega-manual.html#selecting-an-initialization-manager).
DISTRO_FEATURES_append = " systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"

# ROS_DISTRO_BASELINE_PLATFORM is set in ros-distro.inc .
require conf/distro/include/${ROS_DISTRO_BASELINE_PLATFORM}/ros-distro-platform-preferred-providers.inc
require conf/distro/include/${ROS_DISTRO_BASELINE_PLATFORM}/ros-distro-platform-recipe-blacklist.inc
require conf/distro/include/${ROS_DISTRO_BASELINE_PLATFORM}/ros-distro-platform-preferred-versions.inc

# XXX Perhaps these below elsewhere?
PNBLACKLIST[webos-image-ros-roscore] ?= "Not buildable when DISTRO is '${DISTRO}'"
PNBLACKLIST[webos-image-ros-world] ?= "Not buildable when DISTRO is '${DISTRO}'"
