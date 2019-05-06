# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The mbf_simple_nav package contains a simple navigation server implementation of Move Base Flex (MBF). The simple navigation server is bound to no map representation. It provides actions for planning, controlling and recovering. MBF loads all defined plugins which are defined in the lists *planners*, *controllers* and *recovery_behaviors*. Each list holds a pair of a *name* and a *type*. The *type* defines which kind of plugin to load. The *name* defines under which name the plugin should be callable by the actions.           It tries to load the defined plugins which implements the defined interfaces in <a href="wiki.ros.org/mbf_abstract_core">mbf_abstract_core</a>."
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "http://wiki.ros.org/move_base_flex"
SECTION = "devel"
LICENSE = "3-Clause_BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2a17ba6bda1db7ca47fe93a1560e517b"

ROS_BPN = "mbf_simple_nav"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    mbf-abstract-core \
    mbf-abstract-nav \
    mbf-msgs \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    mbf-abstract-core \
    mbf-abstract-nav \
    mbf-msgs \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    mbf-abstract-core \
    mbf-abstract-nav \
    mbf-msgs \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_simple_nav/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "85ff654817a99ed6069c2c5bd0b7392f"
SRC_URI[sha256sum] = "29ab5a2e9938d504135251b3d5aef505d7f67cec5428c96afa6d9abdf3ed532b"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_simple_nav-0.2.3-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('move-base-flex', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/move-base-flex_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/move-base-flex-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/move-base-flex/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
