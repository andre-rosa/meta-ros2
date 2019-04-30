# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "DDS-XCRE agent implementation"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    fastcdr \
    fastrtps \
    microxrcedds-agent-cmake-module \
    rclcpp \
    rosidl-cmake \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
    microxrcedds-agent-cmake-module \
    rosidl-cmake \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    fastcdr \
    fastrtps \
    microxrcedds-agent-cmake-module \
    rclcpp \
    rosidl-cmake \
    rosidl-parser \
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

SRC_URI = "https://github.com/micro-ROS/micro-ROS-Agent-release/archive/release/crystal/micro_ros_agent/0.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fc4b4d7ed599cde3d57626067ddf55e6"
SRC_URI[sha256sum] = "db09d137d08f374c6d6f0bfce90f0bad311ad4a809c5499866d3a5516a1ee6bb"
S = "${WORKDIR}/micro-ROS-Agent-release-release-crystal-micro_ros_agent-0.0.1-2"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/micro-ros-agent/micro-ros-agent_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/micro-ros-agent/micro-ros-agent_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-ros-agent/micro-ros-agent-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-ros-agent/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/micro-ros-agent/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
