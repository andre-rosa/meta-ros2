# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find eProsima Micro XRCE-DDS Agent"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    micro-xrce-dds-agent \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    micro-xrce-dds-agent \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

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

SRC_URI = "https://github.com/micro-ROS/micro-ROS-Agent-release/archive/release/crystal/microxrcedds_agent_cmake_module/0.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ced41669d4ffea0658c95fc4e72071ca"
SRC_URI[sha256sum] = "98f5c52ea0905c8db2c03ad4a66fef5efa557767387384243bffdff042bf8282"
S = "${WORKDIR}/micro-ROS-Agent-release-release-crystal-microxrcedds_agent_cmake_module-0.0.1-2"

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
