# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_action provides a feature to introspect all available ROS   action types. By utilizing rqt_msg, the output format is   unified with it and rqt_srv. Note that the actions shown on this plugin   is the ones that are stored on your machine, not on the ROS core your rqt   instance connects to."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/rqt_action"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    rclpy \
    rqt-gui \
    rqt-gui-py \
    rqt-msg \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rqt_action-release/archive/release/crystal/rqt_action/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4cad11fb289278e1f4f28fe1d76a389d"
SRC_URI[sha256sum] = "7238fa8bf233b4f674088d5229026c07a0e8de91de6183897e92be1786d86b9a"
S = "${WORKDIR}/rqt_action-release-release-crystal-rqt_action-1.0.1-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-action/rqt-action_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-action/rqt-action_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-action/rqt-action-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-action/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-action/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
