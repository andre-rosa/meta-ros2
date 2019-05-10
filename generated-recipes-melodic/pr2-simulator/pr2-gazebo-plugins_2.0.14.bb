# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Gazebo Plugins for various PR2-specific sensors and actuators on the robot."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "John Hsu"
HOMEPAGE = "http://ros.org/wiki/pr2_gazebo_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_simulator"
ROS_BPN = "pr2_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    angles \
    cv-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    gazebo-msgs \
    gazebo-plugins \
    geometry-msgs \
    image-transport \
    message-generation \
    message-runtime \
    nav-msgs \
    orocos-kdl \
    polled-camera \
    pr2-controller-manager \
    pr2-hardware-interface \
    pr2-mechanism-model \
    pr2-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    cv-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    gazebo-msgs \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    image-transport \
    message-generation \
    message-runtime \
    nav-msgs \
    orocos-kdl \
    polled-camera \
    pr2-controller-manager \
    pr2-hardware-interface \
    pr2-mechanism-model \
    pr2-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    cv-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    gazebo-msgs \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    image-transport \
    message-generation \
    message-runtime \
    nav-msgs \
    orocos-kdl \
    polled-camera \
    pr2-controller-manager \
    pr2-hardware-interface \
    pr2-mechanism-model \
    pr2-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_simulator-release/archive/release/melodic/pr2_gazebo_plugins/2.0.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9028427fc0d7ab592ca6ba58cc2403ec"
SRC_URI[sha256sum] = "f13b8d70bb7029d167343772dc662a7aff687349c40ecb02e27020a36a8a784b"
S = "${WORKDIR}/pr2_simulator-release-release-melodic-pr2_gazebo_plugins-2.0.14-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-simulator', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-simulator', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/pr2-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/pr2-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
