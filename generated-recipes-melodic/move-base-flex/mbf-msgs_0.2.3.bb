# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The move_base_flex messages package providing the action definition files for the action GetPath, ExePath, Recovery and MoveBase. The action servers providing these action are implemented in <a href="http://wiki.ros.org/mbf_abstract_nav">mbf_abstract_nav</a>."
AUTHOR = "Jorge Santos <santos@magazino.eu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "3-Clause BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2a17ba6bda1db7ca47fe93a1560e517b"

ROS_BPN = "mbf_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    genmsg \
    geometry-msgs \
    message-generation \
    message-runtime \
    nav-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_msgs/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a69a566e57621905ac5dda51a98d924e"
SRC_URI[sha256sum] = "9ce647ffa0b672e1cda95157baf45218b9000882e3cad50dd384c5c59a5504da"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_msgs-0.2.3-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('move-base-flex', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/move-base-flex_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/move-base-flex-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
