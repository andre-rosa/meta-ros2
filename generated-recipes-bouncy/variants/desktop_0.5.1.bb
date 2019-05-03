# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "A package which extends 'ros_base' and includes high level packages like vizualization tools and demos."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "desktop"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    composition \
    demo-nodes-cpp \
    demo-nodes-cpp-rosnative \
    demo-nodes-py \
    depthimage-to-laserscan \
    dummy-map-server \
    dummy-robot-bringup \
    dummy-sensors \
    examples-rclcpp-minimal-client \
    examples-rclcpp-minimal-composition \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-service \
    examples-rclcpp-minimal-subscriber \
    examples-rclcpp-minimal-timer \
    examples-rclpy-executors \
    examples-rclpy-minimal-client \
    examples-rclpy-minimal-publisher \
    examples-rclpy-minimal-service \
    examples-rclpy-minimal-subscriber \
    image-tools \
    intra-process-demo \
    joy \
    lifecycle \
    logging-demo \
    pcl-conversions \
    pendulum-control \
    ros-base \
    rviz-default-plugins \
    rviz2 \
    sros2 \
    teleop-twist-joy \
    teleop-twist-keyboard \
    tlsf \
    tlsf-cpp \
    topic-monitor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/bouncy/desktop/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1e76dcbf6c2a44220f82f58e065704c6"
SRC_URI[sha256sum] = "2ade64ea13d238799e72867462952c5d98109020ece6ca443e86f27a4d5d0a02"
S = "${WORKDIR}/variants-release-release-bouncy-desktop-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('variants', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/variants_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/variants-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/variants/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
