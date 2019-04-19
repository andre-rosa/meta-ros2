# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Controllers to operate the digital output of the motor controller     boards and the projector board. This package has not been reviewed and     should be considered unstable."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://www.ros.org/wiki/ethercat_trigger_controllers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_controllers"
ROS_BPN = "ethercat_trigger_controllers"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    libtool \
    message-generation \
    pluginlib \
    pr2-controller-interface \
    realtime-tools \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    libtool \
    message-runtime \
    pluginlib \
    pr2-controller-interface \
    realtime-tools \
    roscpp \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    libtool \
    message-runtime \
    pluginlib \
    pr2-controller-interface \
    realtime-tools \
    roscpp \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/ethercat_trigger_controllers/1.10.15-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e7da1ef23ee382ce94a8788cd0a8e605"
SRC_URI[sha256sum] = "a90e00f501dc42e5a50347e28237683a31cd2d959a2fad379d5bda7706de9aed"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-ethercat_trigger_controllers-1.10.15-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-controllers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-controllers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/pr2-controllers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/pr2-controllers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-controllers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}