# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The smach viewer is a GUI that shows the state of hierarchical     SMACH state machines. It can visualize the possible transitions     between states, as well as the currently active state and the     values of user data that is passed around between states. The     smach viewer uses the SMACH debugging interface based on     the <a href="http://www.ros.org/wiki/smach_msgs">smach     messages</a> to gather information from running state machines."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
ROS_AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
HOMEPAGE = "http://ros.org/wiki/smach_viewer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "executive_smach_visualization"
ROS_BPN = "smach_viewer"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    graphviz \
    smach-msgs \
    smach-ros \
    wxpython \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    graphviz \
    smach-msgs \
    smach-ros \
    wxpython \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/melodic/smach_viewer/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5ded98d78fb6a2b3d7c0fb2b648b74d1"
SRC_URI[sha256sum] = "8584bd38b3751fa90a38c2b30e2a4d16882ebfcf49508be583d895856bb0c4e1"
S = "${WORKDIR}/executive_smach_visualization-release-release-melodic-smach_viewer-2.0.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('executive-smach-visualization', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('executive-smach-visualization', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/executive-smach-visualization/executive-smach-visualization_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/executive-smach-visualization/executive-smach-visualization-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/executive-smach-visualization/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/executive-smach-visualization/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
