# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Demonstrates ROS 2's realtime capabilities with a simulated inverted pendulum."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Jackie Kay"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "demos"
ROS_BPN = "pendulum_control"

ROS_BUILD_DEPENDS = " \
    pendulum-msgs \
    rclcpp \
    rttest \
    tlsf-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pendulum-msgs \
    rclcpp \
    rttest \
    tlsf-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
    rmw-implementation-cmake \
    ros2run \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/pendulum_control/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3556c19c9e4ae7e870ffd0c5a051512f"
SRC_URI[sha256sum] = "160c00093e5a42d1b3a66f3000c322ee41dd3c43a04103b6372c99db57475f98"
S = "${WORKDIR}/demos-release-release-crystal-pendulum_control-0.6.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('demos', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('demos', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/demos-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/demos/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
