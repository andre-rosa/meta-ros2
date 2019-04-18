# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using eProsima FastRTPS static code generation in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcutils \
    rmw \
    rmw-fastrtps-shared-cpp \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-ros-native \
    fastrtps-cmake-module-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcutils \
    rmw \
    rmw-fastrtps-shared-cpp \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rcutils \
    rmw \
    rmw-fastrtps-shared-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/crystal/rmw_fastrtps_cpp/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "60d5898884cb3ea1f17ca21b96155ead"
SRC_URI[sha256sum] = "309efba86d62ecbb153d05b71b10b362ab9f89b52f4b324a885c861000cc1f01"
S = "${WORKDIR}/rmw_fastrtps-release-release-crystal-rmw_fastrtps_cpp-0.6.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = " \
    rmw_implementation_packages \
"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rmw-fastrtps/rmw-fastrtps_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rmw-fastrtps/rmw-fastrtps_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rmw-fastrtps/rmw-fastrtps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rmw-fastrtps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rmw-fastrtps/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
